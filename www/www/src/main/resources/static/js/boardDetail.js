document.getElementById('delBtn').addEventListener('click',()=>{
    //delBtn을 누르면 delForm을 button=submit으로 변경하여 실행
    document.getElementById('delForm').submit();
})

document.getElementById('listBtn').addEventListener('click',()=>{
    location.href="/board/list";
})

document.getElementById('modBtn').addEventListener('click',()=>{
    document.getElementById('title').readOnly=false;
    document.getElementById('content').readOnly=false;

    //새로운 버튼 생성
    //<button></button>
    let modBtn = document.createElement('button');
    //<button type="submit"></button>
    modBtn.setAttribute('type','submit');
    modBtn.classList.add('btn','btn-warning');
    modBtn.innerText="Submit";
    //생성한 버튼 modForm 하단에 추가
    document.getElementById('modForm').appendChild(modBtn);

    //기존의 modBtn, delBtn 임시삭제
    document.getElementById('modBtn').remove();
    document.getElementById('delBtn').remove();


})