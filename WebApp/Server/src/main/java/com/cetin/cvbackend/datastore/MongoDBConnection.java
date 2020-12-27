package com.cetin.cvbackend.datastore;

import com.cetin.cvbackend.Experience.Experience;
import com.mongodb.client.MongoCursor;
import org.bson.Document;
import com.mongodb.MongoClient;
import com.mongodb.MongoClientURI;
import com.mongodb.client.MongoCollection;
import com.mongodb.client.MongoDatabase;
import org.bson.types.ObjectId;

import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

import static org.bson.codecs.configuration.CodecRegistries.fromProviders;
import static org.bson.codecs.configuration.CodecRegistries.fromRegistries;

public class MongoDBConnection {
    private static String uri = "mongodb://Admin:Admin@curriculumvitae-shard-00-00.wric6.mongodb.net:27017,curriculumvitae-shard-00-01.wric6.mongodb.net:27017,curriculumvitae-shard-00-02.wric6.mongodb.net:27017/Curriculum_Vitae?ssl=true&replicaSet=atlas-msg9ob-shard-0&authSource=admin&retryWrites=true&w=majority";


    public static List<Experience> getExerciseTable() {
        List<Experience> listExperience = new ArrayList<Experience>();

        MongoClientURI clientURI = new MongoClientURI(uri);
        MongoClient mongoClient = new MongoClient(clientURI);
        MongoDatabase database = mongoClient.getDatabase("Curriculum_Vitae");
        MongoCollection<Document> collection = database.getCollection("Experience");

        try (MongoCursor<Document> cur = collection.find().iterator()) {

            while (cur.hasNext()) {

                var doc = cur.next();
                var mongoExp = new ArrayList<>(doc.values());

                Experience exp = new Experience(
                        (ObjectId) mongoExp.get(0), //_id
                        (String) mongoExp.get(1),   //Customer
                        (String) mongoExp.get(2),   //Description
                        (String) mongoExp.get(3),   //Notes
                        null);//(Double) mongoExp.get(4));  //Duration
                listExperience.add(exp);

            }
        }

        return listExperience;
    }
}
