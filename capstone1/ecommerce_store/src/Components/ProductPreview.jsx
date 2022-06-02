import React, { useState } from "react";
import Button from "react-bootstrap/Button";
import ProductDetail from "./ProductDetail";
import { useNavigate, Link } from "react-router-dom";

export default function ProductPreview(props) {
  const [book, setBook] = useState([props]);

  const navigate = useNavigate();

  return (
    <div>
      <div className="book-item">
        <img className="book-cover" src="/" alt="book cover" />
        <span>
          <h2 className="book-title">{props.title}</h2>
          <h5 className="book-price">${props.price}</h5>
          <a href="/">
            <Button
              className="btn"
              onClick={(e) => {
                e.preventDefault();
                console.log(props);
                navigate("/book", { state: { props } });
                //route to ProductDetail and pass props
              }}
            >
              {/* handleOnClick() {

              // for props above button clicked, open new page displaying correct information derived from props
              } */}
              See Details
            </Button>
          </a>
        </span>
      </div>
    </div>
  );
}
