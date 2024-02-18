import logo from './logo.svg';
import './App.css';


function App() {
  return (
    <div className="App">
      <header className="App-header">
        <h1>Random title</h1>
        <Message text="cats" />
        <Message text="dogs" />
        <p>Random text</p>
      </header>
      <p>Hidden random text</p>

    </div>
  );
}

function Message(props) {
  const textCats = props.text;
  return (
    <div>
      <h2 style={{ color: textCats == "dogs" ? `green` : `red` }}>New text about {props.text}</h2>
      <p>New text</p>
    </div >
  );
}


export default App;
