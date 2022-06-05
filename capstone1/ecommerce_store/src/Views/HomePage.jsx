import React from "react";
import HomeBar from "./HomeBar";
import { Link } from "react-router-dom";
import { FaBookOpen } from "react-icons/fa";
import Carousel from "react-bootstrap/Carousel";

export default function HomePage() {
  return (
    <div>
      <div className="hero">
        <img src="/" alt="colorful background" />
      </div>
      <div className="middle-options">
        <span> Coolest Selection !</span>
        <Link to="/products">
          <FaBookOpen alt="Book icon" size="30px" />
          <p>Browse All Products</p>
        </Link>
        <span> Handpicked Books !</span>
      </div>
      <div className="mobile-carousel">
        <Carousel variant="dark">
          <Carousel.Item>
            <img
              className="d-block w-100"
              src="https://picsum.photos/200"
              alt="First slide"
            />
            <Carousel.Caption>
              <h3>First slide label</h3>
              <p>Nulla vitae elit libero, a pharetra augue mollis interdum.</p>
            </Carousel.Caption>
          </Carousel.Item>
          <Carousel.Item>
            <img
              className="d-block w-100"
              src="https://picsum.photos/200"
              alt="Second slide"
            />

            <Carousel.Caption>
              <h3>Second slide label</h3>
              <p>Lorem ipsum dolor sit amet, consectetur adipiscing elit.</p>
            </Carousel.Caption>
          </Carousel.Item>
          <Carousel.Item>
            <img
              className="d-block w-100"
              src="https://picsum.photos/200"
              alt="Third slide"
            />

            <Carousel.Caption>
              <h3>Third slide label</h3>
              <p>
                Praesent commodo cursus magna, vel scelerisque nisl consectetur.
              </p>
            </Carousel.Caption>
          </Carousel.Item>
        </Carousel>
      </div>
    </div>
  );
}
