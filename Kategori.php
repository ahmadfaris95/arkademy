<!DOCTYPE html>
<html>
<body>

<?php
$servername = "localhost";
$username = "username";
$password = "password";
$dbname = "gudang";

// Create connection
$conn = new mysqli($servername, $username, $password, $dbname);
// Check connection
if ($conn->connect_error) {
    die("Connection failed: " . $conn->connect_error);
} 

$sql = "SELECT c.`id`,c.`name` as product_name,
p.`name` as products
FROM `gudang`.`categories` AS c,
`gudang`.`products` AS p
WHERE c.`id`=p.`category_id` 
ORDER BY c.`id`;";
$result = $conn->query($sql);

if ($result->num_rows > 0) {
    // output data of each row
    while($row = $result->fetch_assoc()) {
        echo "<br>". $row["c.id"]. " ". $row["c.name"]. " " . $row["p.name"] . "<br>";
    }
} else {
    echo "0 results";
}

$conn->close();
?> 

</body>
</html>