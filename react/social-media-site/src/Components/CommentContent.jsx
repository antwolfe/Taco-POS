import React from "react";

const CommentCard = () => {
  return (
    <div className="ui container comments">
      <div className="comment">
        <a href="#" className="avatar">
          <img src="https://www.picsum.photos/50" alt="avatar" />
        </a>
        <div className="content">
          <a href="#" className="author">
            Alex
          </a>

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
