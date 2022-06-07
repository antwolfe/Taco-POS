import { useState } from "react";
import Button from "react-bootstrap/esm/Button";
import Form from "react-bootstrap/Form";

export default function AddInventory({ setItems, items }) {
  const [newId, setNewId] = useState("");
  const [newTitle, setNewTitle] = useState("");

  const [newYear, setNewYear] = useState("");
  const [newPrice, setNewPrice] = useState("");
  const [newCover, setNewCover] = useState("");
  const [newInventory, setNewInventory] = useState("");
  const [newTag, setNewTag] = useState("");

  const handleAddInventory = (e) => {
    e.preventDefault();

    if (!newTitle || !newYear || !newPrice) {
      alert("Please Enter All Fields");
      return;
    }
    setItems([
      ...items,
      {
        id: Number(newId),
        title: newTitle,
        year: Number(newYear),
        price: parseFloat(newPrice),
        qty: 0,
        inventory: Number(newInventory),
        cover: newCover,
        tags: newTag,
      },
    ]);

    setNewTitle("");
    setNewYear("");
    setNewPrice("");
    setNewCover("");
    setNewInventory("");
    setNewTag("");
  };

  return (
    <div>
      <Form className="add-inventory" onSubmit={handleAddInventory}>
        <Form.Group className="mb-3" controlId="formBasicText">
          <Form.Label>ID</Form.Label>
          <Form.Control
            type="number"
            placeholder="Enter Product ID"
            value={newId}
            onChange={(e) => setNewId(e.target.value)}
          />
          <Form.Text className="text-muted"></Form.Text>
        </Form.Group>

        <Form.Group className="mb-3" controlId="formBasicText">
          <Form.Label>Title</Form.Label>
          <Form.Control
            type="text"
            placeholder="Enter Title"
            value={newTitle}
            onChange={(e) => setNewTitle(e.target.value)}
          />
          <Form.Text className="text-muted"></Form.Text>
        </Form.Group>

        <Form.Group className="mb-3" controlId="formBasicAuthor">
          <Form.Label>Year</Form.Label>
          <Form.Control
            type="number"
            placeholder="2022..."
            value={newYear}
            onChange={(e) => setNewYear(e.target.value)}
          />
        </Form.Group>

        <Form.Group className="mb-3" controlId="formBasicPrice">
          <Form.Label>Price</Form.Label>
          <Form.Control
            type="float"
            placeholder="$..."
            value={newPrice}
            onChange={(e) => setNewPrice(e.target.value)}
          />
        </Form.Group>

        <Form.Group className="mb-3" controlId="formBasicText">
          <Form.Label>Inventory</Form.Label>
          <Form.Control
            type="number"
            placeholder="How many?"
            value={newInventory}
            onChange={(e) => setNewInventory(e.target.value)}
          />
          <Form.Text className="text-muted"></Form.Text>
        </Form.Group>

        <Form.Group className="mb-3" controlId="formBasicText">
          <Form.Label>Tags</Form.Label>
          <Form.Control
            type="text"
            placeholder="Any Tags? Separate by ','"
            value={newTag}
            onChange={(e) => setNewTag(e.target.value)}
          />
          <Form.Text className="text-muted"></Form.Text>
        </Form.Group>

        <Form.Group className="mb-3" controlId="formBasicCheckbox">
          <Form.Check
            type="file"
            label="Add Image File"
            value={newCover}
            onChange={(e) => setNewCover(e.target.value)}
          />
        </Form.Group>

        <Button variant="primary" type="submit">
          Submit
        </Button>
      </Form>
    </div>
  );
}
