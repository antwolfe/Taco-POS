import React from "react";
import Button from "react-bootstrap/esm/Button";

export default function ModifyQty() {
  return (
    <div>
      <div className="counter">
        <Button onClick>+</Button>
        <input
          className="qty-num"
          type="number"
          defaultValue={1}
          style={{ width: "35px" }}
        />
        <Button onClick>-</Button>
      </div>
    </div>
  );
}
