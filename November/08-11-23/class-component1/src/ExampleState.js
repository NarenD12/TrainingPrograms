import React, { Component } from 'react';
class ExampleState extends React.Component 
{
    constructor(props) 
    {
        super(props);
        this.state =
        {   
            pcounter: 100,
        }
    }
    incdisplay=()=> 
    {
        this.setState((previous)=>(
            {
                pcounter: previous.pcounter + 1
            }
        )
        );
    }
    decdisplay=()=> 
    {
        this.setState((previous)=>(
            {
                pcounter: previous.pcounter - 1
            }
        )
        );
    }
    render() {
        return (
            < div >
            {this.props.fullname} &nbsp; <hr/>
            {this.props.mobilenumber} <hr/>
                <h1> {this.state.pcounter}</h1>
                <button onClick={this.incdisplay}>Increment</button>
                <button onClick={this.decdisplay}>Decrement</button>
            </div >
        );
    }
}
export default ExampleState
