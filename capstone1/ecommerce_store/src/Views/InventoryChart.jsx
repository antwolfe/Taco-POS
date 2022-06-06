import InventoryItem from "../Components/InventoryItem";
import { useState } from "react";

export default function InventoryChart({ data, setItems }) {
  const allProductQty = data.map((item) => {
    return item.inventory;
  });

  const [inventoryQty, setInventoryQty] = useState(allProductQty);
  // console.log(allProductQty);
  return (
    <div>
      {data.map((item) => {
        return (
          <div key={item.id}>
            <InventoryItem
              product={item}
              inventoryQty={inventoryQty}
              setInventoryQty={setInventoryQty}
              setItems={setItems}
            />
          </div>
        );
      })}
    </div>
  );
}
