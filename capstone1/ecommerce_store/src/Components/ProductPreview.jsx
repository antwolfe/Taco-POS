import React from "react";
import Button from "react-bootstrap/Button";
import HomeBar from "./HomeBar";

export default function ProductPreview(book) {
  console.log(book);

  return (
    <div>
      <div className="book-item">
        <img className="book-cover" src="/" alt="book cover" />
        <span>
          <h2 className="book-title">{book.title}</h2>
          <h5 className="book-price">${book.price}</h5>
          <a href="/">
            <Button className="btn">See Details</Button>
          </a>
        </span>
      </div>
    </div>
  );
}
