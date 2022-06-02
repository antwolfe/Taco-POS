import React from "react";

//props from CommentFeed

export default function CommentCard({ avatar, author, commentDate, message }) {
  return (
    <div className="ui container comments">
      <div className="ui card">
        <div className="comment-content" style={{ margin: 3 }}>
          <div className="comment">
            <a href="#" className="avatar">
              <img src={avatar} alt="avatar" />
            </a>
            <div className="content">
              <span className="author">{author}</span>

              <div className="metadata">
                <span className="date"> {commentDate.slice(0, 10)} </span>
              </div>
              <div className="text">{message}</div>
            </div>
          </div>
        </div>
      </div>
    </div>
  );
}
