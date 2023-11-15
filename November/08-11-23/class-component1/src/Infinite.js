import React, { Component } from 'react';
class Infinite extends React.Component 
{
    render(){
        return (
            < div >
            Hi Naren...
        <Turbify />
            </div >
        );
    }
}

class Turbify extends React.Component {

    render() {
        return(   
            < div >
            <h2>Welcome to Turbify.Onboarding Starts soon.... </h2>
            <a href="Details.html">Personal Details</a>
            </div >
         );
}
}
export default Infinite;