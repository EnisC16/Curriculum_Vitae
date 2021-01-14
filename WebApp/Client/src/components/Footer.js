import React from 'react'
import './Footer.css'
import SocialMediaIcons from 'react-social-media-icons';

function Footer() {
    const socialMediaIcons = [
        {
          url: 'https://github.com/EnisC16',
          className: 'fa-github-square',
        }
      ];
      
      

    return (
        <footer className="footer__main">

            <div className="footer__contactdata">
                <h3>Contact Me</h3><br/>
                <p>E-Mail: enis.c16@outlook.com</p>
                <p>Phone: 0172/2672631</p>
            </div>

            <div className="footer__links">
                <h3>Contact Me</h3><br/>
                <a href="https://github.com/EnisC16">GitHub</a>
                <SocialMediaIcons
                    icons={socialMediaIcons}
                    iconSize={'1.3em'}
                    iconColor={'#495056'}
                />
            </div>
            
        </footer>
    )
}

export default Footer
