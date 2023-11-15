import React from 'react';

class TodoList extends React.Component{
   componentDidUpdate(){
        // if(this.props.inputElement())
        // this.props.inputElement.current.focus();
   }

    render(){
        return(
            <div className='todoListMain'>
                <div className='header'>
                    <form onSubmit={this.props.addItem}>
                        <input type="text" placeholder='Task' value={this.props.currentItem.next} onChange={this.props.handleInput}></input>
                        <button type="submit">Add Task</button>
                    </form>
                </div>
            </div>

        );
    }
}

export default TodoList;