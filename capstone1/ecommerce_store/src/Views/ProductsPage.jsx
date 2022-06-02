import React from "react";
import HomeBar from "./HomeBar";
import ParseInventory from "../Components/ParseInventory";
import ProductPreview from "../Components/ProductPreview";

export default function ProductsPage() {
  return (
    <div>
      <ParseInventory />
      <ProductPreview />
      <HomeBar />
    </div>
  );
}
