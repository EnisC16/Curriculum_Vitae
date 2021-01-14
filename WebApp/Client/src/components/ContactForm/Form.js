import React, { Component } from 'react';
import Button from '@material-ui/core/Button';
import TextField from '@material-ui/core/TextField';
import './Form.css';


function fetchAPI(map) {
  return fetch("http://localhost:8080/api/v1/mail?name=" + map.name + "&email=" + map.email + "&message=" + map.message);
}


class Form extends Component {
  constructor(props) {
    super(props);
    this.state = {
      name: '',
      email: '',
      message: '',
      isClicked: false,
    };
    // To ensure 'this' when calling 'this.updateField' refers to Form and not Field, we do:
    this.updateField = this.updateField.bind(this);
    this.logFormDataToConsole = this.logFormDataToConsole.bind(this);
  }

  // Field could be 'name', 'email', or 'message'
  // Value is whatever the user types into the input field.
  updateField(field, value) {
    this.setState({ [field]: value });
  }

  logFormDataToConsole(event) {
    this.setState({ isClicked: true });
    console.log('Form Values', this.state.email);

    fetchAPI(this.state).then(result => {
        console.log("message was sent !!!!", result);
    });

  }

  render() {
    const isClicked = this.state.isClicked;
    let body;
    if(! isClicked) {
      body = <div className="form__innerwrapper">
          <div className="form__inputs">
              <div className="form__contactText">
                  <h2>Contact Me</h2>
              </div>
              <div>
                  <TextField className="form__input" label="Name" variant="outlined" size="small" fullWidth
                          onChange={(event) => this.updateField('name', event.target.value)}
                  />
                  <div className="form__margin"></div>
                  <TextField className="form__input" label="E-Mail" variant="outlined" size="small" fullWidth
                          onChange={(event) => this.updateField('email', event.target.value)}
                  />
                  <div className="form__margin"></div>
                  <TextField className="form__input" label="Message" variant="outlined" multiline fullWidth
                          onChange={(event) => this.updateField('message', event.target.value)}
                  />
                  <div className="form__margin"></div>
              </div>
          </div>
          
          <div className="form__button">
              <Button 
                  variant="contained" 
                  style={{ background: '#00587a', color: '#ffffff' }} 
                  className="button__button"
                  onClick={this.logFormDataToConsole}
              >
                  Send
              </Button>
              
          </div>

      </div>;
    } else {
      body = <div className="form__innerwrapper form__thank">Thanks</div>
    }



    return (
        <div className="form__wrapper">
            {body}
        </div>
    );
  }
}

export default Form;