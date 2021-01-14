import React from 'react';
import './App.css';
import NavTabs from './Nav/NavTabs';


class App extends React.Component {
    render(){
        return (
            <div className="app__wrapper">
                <NavTabs />
            </div>
            
        );
    }
}

export default App;
