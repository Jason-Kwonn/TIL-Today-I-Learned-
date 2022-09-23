# 파이썬 웹 크롤러 만들기-2판

# 첫 번째 웹 크롤러
# BeautifulSoup 설치 및 실행
from urllib.request import urlopen
from bs4 import BeautifulSoup

html = urlopen("http://www.pythonscraping.com/pages/page1.html")
bs = BeautifulSoup(html.read(), 'lxml')
print(bs.h1)
print()

# URL 오타나, 다운 발생 시 에러 예외처리
from urllib.request import urlopen
from urllib.error import HTTPError
from urllib.error import URLError

try:
    html = urlopen("http://www.pythonscrapingthisurldosenotexist.com")
except HTTPError as e:
    print(e)
except URLError as e:
    print('The server could not be found!')
else:
    print('It worked!')
print()

# 존재하지 않는 태그 예외처리
try:
    badContent = bs.nonExistingTag.anotherTag
except AttributeError as e:
    print("Tag was not found")
else:
    if badContent == None:
        print("Tag was not found")
    else:
        print(badContent)

#%% 모듈화

from urllib.request import urlopen
from urllib.error import HTTPError
from bs4 import BeautifulSoup

def getTitle(url):
    try:
        html = urlopen(url)
    except HTTPError as e:
        return None
    try:
        bs = BeautifulSoup(html.read(), 'html.parser')
        title = bs.body.h1
    except AttributeError as e:
        return None
    return title

title = getTitle('http://www.pythonscraping.com/pages/page1/html')
if title == None:
    print('Title could not be found')
else:
    print(title)
# Commit it