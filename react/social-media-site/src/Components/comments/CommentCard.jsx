import React from "react";

const ContentCard = (props) => {
  return (
    <div className="ui raised card">
      <div className="content">{props.children}</div>
    </div>
  );
};

export default ContentCard;
