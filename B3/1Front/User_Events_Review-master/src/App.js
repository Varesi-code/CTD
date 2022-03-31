import React from 'react';
import { AppContainer, MainTitle, MainWrapper } from "./styles/App.styled.js";

import InputTask from './Tuesday/InputTask.js';
import TaskCards from './Tuesday/TaskCards.js';

class App extends React.Component{
  constructor(){
    super()
    this.state= ({
      tasks: []
    })
    this.handlerValues = this.handlerValues.bind(this)
  };
  

  handlerValues( paramValue ){
    this.setState({tasks: [...this.state.tasks, paramValue]})
  }

  render(){
    let objTasks = this.state.tasks?.map((task, index)=> ({ id: index, tasks: task}));
    return(
      <AppContainer>  
        <MainWrapper>
          <MainTitle>Review Making a TODO List</MainTitle>
            <InputTask taskFn={this.handlerValues}/>
            {
              objTasks?.map(task=>
                <TaskCards
                  key={task.id}
                  task={task.tasks}
                />
              )
            }
        </MainWrapper>
      </AppContainer>
    )
  };
};
export default App;
