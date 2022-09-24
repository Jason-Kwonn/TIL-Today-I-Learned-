# 고급 HTML 분석
#%% 2-1 css 속성값 찾아 검색
from urllib.request import urlopen
from bs4 import BeautifulSoup

html = urlopen('https://www.pythonscraping.com/pages/warandpeace.html')
bs = BeautifulSoup(html, 'html.parser')

nameList = bs.findAll('span', {'class' : 'green'})
for name in nameList:
    print(name.get_text())
print()
print()

#%% 2-2 header 검색
from urllib.request import urlopen
from bs4 import BeautifulSoup

html = urlopen('https://www.pythonscraping.com/pages/warandpeace.html')
bs = BeautifulSoup(html, 'html.parser')

headerList = bs.findAll({'h1', 'h2', 'h3', 'h4', 'h5', 'h6'})
for header_name in headerList:
    print(header_name.get_text())
print()
print()

#%% 2-3 녹색, 빨간색 span 태그 모두 반환
from urllib.request import urlopen
from bs4 import BeautifulSoup

html = urlopen('https://www.pythonscraping.com/pages/warandpeace.html')
bs = BeautifulSoup(html, 'html.parser')

nameList = bs.findAll('span', {'class' : {'green', 'red'}})
for name in nameList:
    print(name.get_text())
print()
print()

# %%
