function findLog() {
    let userNamei = $('#userName').val();
    let passwordi = $('#password').val();

    $.ajax({
        method:"GET",
        url:"http://localhost:8080/api/v1/regi/getRegi",
        async:true,
        success: function (data) {
            console.log(data)
            $('#empTable').empty();
            for (let emp of data){
                let userNamea=emp.userName
                let passworda=emp.password

                if(userNamea === userNamei && passworda === passwordi)
                {
                    window.location.assign("../selectsection/selectsection.html");

                }
            }
        },
        error: function (xhr, exception) {
            alert("Error")
        }
    })

}


