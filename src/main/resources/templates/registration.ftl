<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <title>Title</title>
</head>
<body>

<script>
    function sendData() {

        const data = {
            firstname: document.querySelector('input[name="firstname"]').value,
            lastname: document.querySelector('input[name="lastname"]').value,
            phone: document.querySelector('input[name="phone"]').value,
            username: document.querySelector('input[name="username"]').value,
            password: document.querySelector('input[name="password"]').value,
        };

        fetch(
            '/registration',
            {
                method: 'POST',
                headers: {
                    'Content-Type': 'application/json'
                },
                body: JSON.stringify(data)
            }
        )
            .then(response => {
                response.json()
                if (response.ok) {
                    window.location.href = "/login";
                } else {
                    response.json().then(errorData=> {
                        console.log("Err", errorData);
                    })
                }
                }
            )
            .catch(err=>console.log(err));
    }
</script>

<h1>Form Registration</h1>

<form onsubmit="sendData(); return false;">
    <label>First name:</label><br>
    <input type="text" name="firstname"><br>
    <label>Last name:</label><br>
    <input type="text" name="lastname"><br>
    <label>Phone:</label><br>
    <input type="text" name="phone" placeholder="+380XXXXXXX"><br>
    <label>Username:</label><br>
    <input type="text" name="username"><br>
    <label>Password:</label><br>
    <input type="text" name="password"><br><br>
    <input type="submit" value="add">
</form>

</body>
</html>