import React from 'react'
import './AboutMe.css';
import { useTranslation } from 'react-i18next';
import Button from '@material-ui/core/Button';
import Form from './ContactForm/Form';

function AboutMe() {
    const { t, i18n } = useTranslation('common');

    const goToForm = () => {
        window.scrollTo(0, 800);
    };

    return (
        <div>
            <div className="aboutMe">
                <div className="aboutMe__con1">
                    <h1>{t('aboutme.header')}</h1>
                    <div className="aboutMe__btnContainer">
                        <Button variant="contained" style={{ background: '#00587a', color: '#ffffff' }} className="aboutMe__emailBtn" onClick={goToForm}>
                            {t('aboutme.email-me')}
                        </Button>
                        
                    </div>
                </div>
                <div className="aboutMe__con2">
                    <img className="Enis" alt="" src="/images/Enis.jpeg" />
                </div>
            </div>

            <div className="aboutMe__background">
                <div className="aboutMe__backgroundCon1">
                    <h3>- MY BACKGROUND</h3>
                    <div className="background_txt">
                        {t('aboutme.my-background-txt')}<br/>
                        {t('aboutme.my-background-txt2')}
                    </div>
                </div>

                <div className="aboutMe__backgroundCon2">
                    <h3>- Skills</h3>
                    <div className="skill_txt">
                        Node.js, React.js, Javascript, HTML, CSS, Java, Lightning Web Component etc.
                    </div>
                </div>
            </div>

            <div className="aboutMe__contactForm">
                <Form />
            </div>
            
        </div>
    )
}

export default AboutMe
