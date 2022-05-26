import React from "react";

// TODO: Link comment dropdown to comments
// Link comments to FeedCard through parseComments
//Enter Comment onEnter key or have post button

export default function FeedCard(props) {
  return (
    <div className="container">
      <div className="ui card" style={{ margin: 10 }}>
        <div className="content">
          <div className="right floated meta">
            {props.postDate.slice(0, 10)}
          </div>
          <img className="ui avatar image" src={props.avatar} />
          {props.name}
        </div>
        <div className="image">
          <img src={props.image} />
        </div>
        <div className="content">
          <p className="description">{props.description}</p>
          <span className="right floated">
            <i className="heart outline like icon"></i>
            {props.likeCount}
          </span>
          <a href="" className="comment-dropdown">
            <i className="comment icon"></i>3 comments
          </a>
        </div>
        <div className="extra content">
          <div className="ui large transparent left icon input">
            <i className="heart outline icon"></i>
            <input type="text" placeholder="Add Comment..." />
          </div>
        </div>
      </div>
    </div>
  );
}
