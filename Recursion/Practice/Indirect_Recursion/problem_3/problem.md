## **Problem 3: Tree traversal using indirect recursion**


Simulate in-order traversal of a binary tree with indirect recursion:
`inorder(node)` calls `processLeft(node.left)` which then calls `inorder(node.left)` — well, that’s direct actually, so let's modify:
Actually, a better example:
`traverseA(node)` processes node, calls `traverseB(node.right)`,
`traverseB(node)` processes node, calls `traverseA(node.left)`,
but with checks to avoid infinite loops. This is a bit artificial but illustrates mutual recursion.
