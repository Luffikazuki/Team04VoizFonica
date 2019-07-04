$(document).ready(function(){
  //Toggle between recharge and Bill pay in Post Paid Start here
  $("#PostPaid-Plan").click(function(){
    $("#PostPaid-Plan").css("background","#0076ff");
    $("#PostPaid-Plan").css("color","white");
    $("#PostPaid-bill").css("background","white");
    $("#PostPaid-bill").css("color","#0076ff");
    $("#PostPaid-planDetails").css("display","contents"); //To display the contents as it is
    $("#PostPaid-billDetails").css("display","none");
  });

  $("#PostPaid-bill").click(function(){
    $("#PostPaid-bill").css("background","#0076ff");
    $("#PostPaid-bill").css("color","white");
    $("#PostPaid-Plan").css("background","white");
    $("#PostPaid-Plan").css("color","#0076ff");
    $("#PostPaid-planDetails").css("display","none");
    $("#PostPaid-billDetails").css("display","contents");
  });

    //Toggle between recharge and Bill pay in Post Paid End here
});
