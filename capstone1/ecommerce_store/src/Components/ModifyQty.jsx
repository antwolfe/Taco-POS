import { useState, useEffect } from "react";
import Button from "react-bootstrap/esm/Button";
import CartTotal from "./CartTotal";

export default function ModifyQty({ onDelete, product, items, setItems }) {
  const [qty, setQty] = useState(1);

  const maxQty = product.inventory;

  const increment = () => {
    if (qty < maxQty) {
      setQty((product.qty += 1));
      items.map((item) => {
        if (item.id) {
          setItems([...items, qty]);
        }
      });
    } else {
      alert("OUT OF STOCK");
    }
  };

  const decrement = () => {
    if (qty > 0) {
      setQty((product.qty -= 1));
      items.map((item) => {
        if (item.id) {
          setItems([...items, qty]);
        }
      });
    } else {
      onDelete(product);
    }
  };

  return (
    <div>
      <div className="counter">
        <Button
          onClick={() => {
            increment();
          }}
        >
          +
        </Button>
        <input
          className="qty-num"
          type="number"
          value={qty}
          style={{ width: "35px" }}
        />
        <Button onClick={decrement}>-</Button>
      </div>
    </div>
  );
}
