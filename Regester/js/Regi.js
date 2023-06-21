function saveRegi(){
    let email=$('#email').val();
    let name=$('#uname').val();
    let number=$('#mnumber').val();
    let address=$('#address').val();
    let password=$('#pass').val();
    let cpassword=$('#cpass').val();


    $.ajax({
        method:"POST",
        contentType:"application/json",
        url:"http://localhost:8080/api/v1/regi/saveRegi",
        async:true,
        data:JSON.stringify({

            "id": 0,
            "userName": name,
            "email": email,
            "number": number,
            "addres": address,
            "password": password,
            "confirmPassword": cpassword
        }),
        success: function (data) {
            alert("saved")
        },
        error: function (xhr, exception) {
            alert("Error")
        }
    })
}