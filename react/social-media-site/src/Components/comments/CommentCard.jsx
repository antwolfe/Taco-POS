import React from "react";

export default function CommentCard(props) {
  console.log(props);

  return (
    <div className="ui container comments">
      <div className="ui raised card">
        <div className="content">
          <div className="comment">
            <a href="#" className="avatar">
              <img src={props.avatar} alt="avatar" />
            </a>
            <div className="content">
              <span className="author">{props.author}</span>

              <div className="metadata">
                <span className="date"> {props.commentDate} </span>
              </div>
              <div className="text">{props.message}</div>
            </div>
          </div>
        </div>
      </div>
    </div>
  );
}
