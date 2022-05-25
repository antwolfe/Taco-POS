import React from "react";

const CommentCard = () => {
  const [author, setAuthor] = "N.S";

  return (
    <div className="ui container comments">
      <div className="comment">
        <a href="#" className="avatar">
          <img src="https://www.picsum.photos/50" alt="avatar" />
        </a>
        <div className="content">
          <span className="author">{author}</span>

          <div className="metadata">
            <span className="date"> The date </span>
          </div>
          <div className="text">The comment</div>
        </div>
      </div>
    </div>
  );
};

export default CommentCard;
