import React from 'react'
import './AboutMe.css';
import { useTranslation } from 'react-i18next';
import Button from '@material-ui/core/Button';

function AboutMe() {
    const { t, i18n } = useTranslation('common');

    return (
        <div>
            <div className="aboutMe">
                <div className="aboutMe__con1">
                    <h1>{t('aboutme.header')}</h1>
                    <div className="aboutMe__btnContainer">
                        <Button variant="contained" color="primary" className="aboutMe__emailBtn">
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
                </div>

                <div className="aboutMe__backgroundCon2">
                    <h3>- MY BACKGROUND</h3>
                </div>
            </div>
            
        </div>
    )
}

export default AboutMe
