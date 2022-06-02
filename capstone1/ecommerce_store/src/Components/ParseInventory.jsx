import inventoryData from "../inventory.json";

import React from "react";

export default function parseInventory() {
  const inventory = inventoryData.map((book) => {
    console.log(book);
  });

  return <div>{inventory}</div>;
}
