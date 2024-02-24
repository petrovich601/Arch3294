function Message(props) {
    const textCats = props.text;
    return (
        <div>
            <h2 style={{ color: textCats == "dogs" ? `green` : `red` }}>New text about {props.text}</h2>
            <p>New text</p>
        </div >
    );
}
export default Message;