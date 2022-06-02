import React from "react";
import Button from "react-bootstrap/Button";
import HomeBar from "./HomeBar";

export default function ProductPreview(props) {
  console.log(props);

  return (
    <div>
      <div className="book-item">
        <img className="book-cover" src="/" alt="book cover" />
        <span>
          <h2 className="book-title">{props.title}</h2>
          <h5 className="book-price">${props.price}</h5>
          <a href="/">
            <Button className="btn">See Details</Button>
          </a>
        </span>
      </div>
    </div>
  );
}
