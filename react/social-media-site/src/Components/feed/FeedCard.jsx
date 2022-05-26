import React from "react";
import CommentCard from "../comments/CommentCard";
import CommentFeed from "../comments/CommentFeed";

// TODO: Link comment dropdown to comments
// Link comments to FeedCard through parseComments
//Enter Comment onEnter key or have post button

export default function FeedCard(props) {
  return (
    <div className="container">
      <div className="ui card" style={{ margin: 10 }}>
        <div className="content">
          <div className="right floated meta">{props.post.publishDate}</div>
          <img className="ui avatar image" src={props.post.owner.picture} />
          {props.post.owner.firstName}
        </div>
        <div className="image">
          <img src={props.post.image} />
        </div>
        <div className="content">
          <p className="description" style={{ padding: 2 }}>
            {props.post.text}
          </p>
          <span className="right floated">
            <i className="heart outline like icon"></i>
            {props.post.likes}
          </span>
          <div id="comment-section" className="ui accordion">
            <i
              style={{ cursor: "pointer" }}
              className="comment icon"
              onClick={() => {}}
            ></i>
            <CommentFeed post={props.post.id} />
          </div>
          <div className="content"></div>
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
