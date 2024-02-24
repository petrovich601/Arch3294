import logo from './logo.svg';
import './App.css';
import Message from './components/Animals';
import CommentsList from './components/CommentsList';


function App() {
  return (
    <div className="App">
      <header className="App-header">
        <h1>Random title</h1>

        <Message text="cats" />
        <Message text="dogs" />
        <p>Random text</p>
        <CommentsList />
      </header>
      {/* <p>Hidden random text</p>
      <Message /> */}

    </div>
  );
}




export default App;
