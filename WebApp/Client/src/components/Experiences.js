import React, {useState, useEffect} from 'react';
import { useTranslation } from 'react-i18next';
import axios from "axios"
import './Experiences.css';

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
            <div className="experience__exp_div">
                <h4>{experience.customerName}</h4>
                {experience.description.split('<br/>').map((desc,i) => {return <p>{desc}</p>})}
            </div>
        )
    })
}

function Experiences() {
    return (
        <div className="experience___wrapper">
            <MyExpereiences />
        </div>
    )
}

export default Experiences;
