import logo from './logo.svg';
import './App.css';
import Infinite from './Infinite';
import ExampleState from './ExampleState';
import Turbify from './Infinite';

function App() {
  return (
    <div>
    <h2 align="right">{new Date().toLocaleString() }</h2>
    <div className="App">
      <header className="App-header">
        <img src={logo} className="App-logo" alt="logo" />
        <ExampleState fullname="Naren" mobilenumber="9876543210"/>
        <Turbify/>
      </header>
    </div>
    </div>
  );
}

export default App;
