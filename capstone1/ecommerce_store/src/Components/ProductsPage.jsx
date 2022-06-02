import React from "react";
import HomeBar from "./HomeBar";
import ParseInventory from "./ParseInventory";
import ProductPreview from "./ProductPreview";

export default function ProductsPage() {
  return (
    <div>
      <ParseInventory />
      <ProductPreview />
      <HomeBar />
    </div>
  );
}
