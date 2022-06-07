import InventoryItem from "../Components/InventoryItem";
import Button from "react-bootstrap/esm/Button";
import { useState } from "react";
import AddInventory from "./AddInventory";

export default function InventoryChart({ items, setItems }) {
  const [showAdd, setShowAdd] = useState(false);

  const deleteFromInventory = (product) => {
    setItems(items.filter((item) => item.id !== product.id));
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
        <Button
          variant="primary"
          size="lg"
          onClick={() => setShowAdd(!showAdd)}
        >
          Click Here To Add an Item
        </Button>
      </div>
      {showAdd && <AddInventory setItems={setItems} items={items} />}
    </div>
  );
}
