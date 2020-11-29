import React, {useState, useEffect} from 'react';
import { useTranslation } from 'react-i18next';
import axios from "axios"

const MyExpereiences = () => {
    const [experiences, setExperiences] = useState([]);

    const fetchExperiences = () => {
        axios.get("http://localhost:8080/api/v1/experiences").then(res => {
            console.log(res);
            setExperiences(res.data);
        });
    }

    useEffect(() => {
        fetchExperiences();
    }, []);

    return experiences.map((experience, index) => {
        return (
            <div>
                <h1>{experience.customerName}</h1>
                {experience.description.split('\n').map((desc,i) => {return <p>{desc}</p>})}
            </div>
        )
    })
}

function Experiences() {
    return (
        <div>
            <MyExpereiences />
        </div>
    )
}

export default Experiences;
