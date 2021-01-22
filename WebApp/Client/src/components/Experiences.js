import React, {useState, useEffect} from 'react';
import Ratings from 'react-ratings-declarative';
import axios from "axios"
import './Experiences.css';

const MyExpereiences = () => {
    const [experiences, setExperiences] = useState([]);

    const fetchExperiences = () => {
        axios.get("http://18.189.197.103:8080/api/v1/experiences").then(res => {
            console.log(res);
            setExperiences(res.data);
        });
    }

    useEffect(() => {
        fetchExperiences();
    }, []);

    return experiences.map((experience, index) => {
        return (
            <div className="experience__exp_div" key={index}>
                <h4>{experience.customerName}</h4>
                <p className="experience__title">( as {experience.title})</p>
                {experience.description.split('<br/>').map((desc,i) => {return <p key={i}>{desc}</p>})}
            </div>
        )
    })
}

const MySkills = () => {
    const [skills, setSkills] = useState([]);

    const fetchSkills = () => {
        axios.get("http://18.189.197.103:8080/api/v1/skills").then(res => {
            console.log(res);
            setSkills(res.data);
        });
    }

    useEffect(() => {
        fetchSkills();
    }, []);

    return skills.map((skill, index) => {
        return (
            <div className="skill__skill_div" key={index}>
                <p>{skill.name}</p>
                <div className="skill__star_div">
                    <Ratings
                        rating={skill.rating}
                        widgetDimensions="13px"
                        widgetSpacings="15px"
                    >
                        <Ratings.Widget widgetRatedColor="rgb(0, 136, 145)"/>
                        <Ratings.Widget widgetRatedColor="rgb(0, 136, 145)"/>
                        <Ratings.Widget widgetRatedColor="rgb(0, 136, 145)"/>
                        <Ratings.Widget widgetRatedColor="rgb(0, 136, 145)"/>
                        <Ratings.Widget widgetRatedColor="rgb(0, 136, 145)"/>
                    </Ratings>
                </div>
                
            </div>
        )
    })
}

function Experiences() {
    return (
        <div className="wrappper">
        <div className="exp_skill_wrapper">
            <div className="skill___header">
                <h4><span> Skills </span></h4>
            </div>
            <div className="skill___wrapper">
                <MySkills />
            </div>
            
        </div>
        <br/><br/><br/>
        <div className="skill___header">
            <h4><span> Experiences </span></h4>
        </div>
        <div className="experience___wrapper">
                <MyExpereiences />
            </div>
        </div>
    )
}

export default Experiences;
