import React from 'react'
import Select from 'react-select'
import { useTranslation } from 'react-i18next';
import  {availableLanguages} from './Data';
import './Language.css'


function Language() {
    const { t, i18n } = useTranslation('common');

    const handleChange = e => {
        i18n.changeLanguage(e.value)
    }

    return (
        <div className="language">
            <div className="language__container">
                <div>
                    <h1>{t('language.language-setting')}</h1>
                    <p>
                        {t('language.text')}
                    </p>

                    <Select 
                        onChange={handleChange}
                        value={availableLanguages.filter(option => option.value === i18n.language)}
                        label="select lang"
                        options={availableLanguages}
                        className="language__select"
                    />
                </div>
                
                
            </div>
        </div>
    )
}

export default Language
