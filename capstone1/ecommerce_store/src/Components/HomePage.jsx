import React from "react";
import HomeBar from "./HomeBar";

export default function HomePage() {
  return (
    <div>
      <div className="hero">
        <img src="/" alt="colorful background" />
      </div>
      <div className="middle-options">
        <img src="/" alt="Coolest Selection background" />
        <img src="/" alt="Book icon" />
        <img src="/" alt="Handpicked Books background" />
      </div>
      <div className="mobile-carousel">
        <img src="/" alt="rotating books" />
      </div>
      <HomeBar />
    </div>
  );
}
