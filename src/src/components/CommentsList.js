import { useEffect, useState } from 'react'

function CommentsList() {
    const [comments, setComments] = useState([
        { id: 1, text: "Это первый комментарий" },
        { id: 2, text: "Это второй комментарий" },
        { id: 3, text: "Это третий комментарий" }
    ]);



    return comments.map((comment) =>
        <div>
            <div key={comment.id}>{comment.text}</div>
            <button onClick={() => setComments(comments.filter((a) => a.id !== comment.id))}>Удалить комментарий</button>
        </div>
    )
}

export default CommentsList;
