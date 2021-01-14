import React from 'react'
import './Footer.css'
import { SocialIcon } from 'react-social-icons';

function Footer() {
    return (
        <footer className="footer__main">

            <div className="footer__contactdata">
                <h3>Contact Me</h3><br/>
                <p>E-Mail: enis.c16@outlook.com</p>
                <p>Phone: 0172/2672631</p>
            </div>

            <div className="footer__links">
                <h3>Social Media</h3><br/>
                <SocialIcon url="https://github.com/EnisC16" />&nbsp;&nbsp;&nbsp;
                <SocialIcon url="https://www.linkedin.com/in/enis-c-962854162/" />
            </div>
            
        </footer>
    )
}

export default Footer
