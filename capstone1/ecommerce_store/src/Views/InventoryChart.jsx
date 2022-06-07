import InventoryItem from "../Components/InventoryItem";
import Button from "react-bootstrap/esm/Button";
import { useState } from "react";

export default function InventoryChart({ items, setItems }) {
  const allProductsId = items.map((item) => {
    return item.id;
  });

  console.log(items);

  const deleteFromInventory = (product) => {
    setItems(items.filter((item) => item.id !== product.id));
  };

  const addToInventory = (product) => {
    setItems([...items, product]);
  };

  return (
    <div>
      <div>
        {items.map((item) => {
          return (
            <div key={item.id}>
              <InventoryItem
                product={item}
                deleteFromInventory={deleteFromInventory}
              />
            </div>
          );
        })}
      </div>
      <div className="d-grid gap-2">
        <Button variant="primary" size="lg" onClick={addToInventory}>
          Click Here To Add an Item
        </Button>
      </div>
    </div>
  );
}
