package com.cetin.cvbackend.datastore;

import com.cetin.cvbackend.Experience.Experience;
import com.cetin.cvbackend.Skill.Skill;
import com.mongodb.client.MongoCursor;
import org.bson.Document;
import com.mongodb.MongoClient;
import com.mongodb.MongoClientURI;
import com.mongodb.client.MongoCollection;
import com.mongodb.client.MongoDatabase;
import org.bson.types.ObjectId;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
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
                        null,
                        (String) mongoExp.get(6),   //Title
                        null);//(Double) mongoExp.get(4));  //Duration
                listExperience.add(exp);

            }
        }

        for(Experience e : listExperience) {
            System.out.println();
            System.out.println(e.getCustomerName());
            System.out.println(e.getTitle());
            System.out.println();
        }


        return listExperience;
    }

    public static List<Skill> getSkillTable() {
        List<Skill> listSkill = new ArrayList<Skill>();

        MongoClientURI clientURI = new MongoClientURI(uri);
        MongoClient mongoClient = new MongoClient(clientURI);
        MongoDatabase database = mongoClient.getDatabase("Curriculum_Vitae");
        MongoCollection<Document> collection = database.getCollection("Skill");

        try (MongoCursor<Document> cur = collection.find().iterator()) {

            while (cur.hasNext()) {

                var doc = cur.next();
                var mongoExp = new ArrayList<>(doc.values());

                Skill exp = new Skill(
                        (ObjectId) mongoExp.get(0), //_id
                        (String) mongoExp.get(1),   //name
                        (Double) mongoExp.get(2)   //rating
                );
                listSkill.add(exp);
            }
        }

        listSkill.sort(Comparator.comparing(Skill::getRating, (s1, s2) -> {
            if(s1 == s2) return 0;
            return s1 > s2 ? -1 : 1;
        }));

        return listSkill;
    }


}
