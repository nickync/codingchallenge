import time
import functools
import asyncio


def messeger():
    msg = None
    while True:
        m = yield msg
        print(m)


def coroutine(function):
    @functools.wraps(function)
    def wrapper(*args, **kwargs):
        generator = function(*args, **kwargs)
        next(generator)
        return generator

    return wrapper

@coroutine
def messeger2():
    msg = None
    while True:
        m = yield msg
        print(m)

async def messenger3(msg):
    n = 5
    while n > 0: 
        time.sleep(1)
        print('sleeping for 1 sec')
        n -= 1
    return msg + ' waited'


async def runAsync(x):
    msg = await messenger3(x)
    print(msg)


def run():
    g = messeger()
    next(g)
    g2 = messeger2()
    for i in range(500):
        time.sleep(1)
        print('Main process -------' + str(i) )
        if (i % 20 == 0):
            g.send('coroutine')

        if (i % 20 + 1 == 10):
            g2.send('@decorator coroutine')

        if (i % 10 == 0):
            msg = str(i) + ' Async func'
            asyncio.run( runAsync(msg) )


if __name__ == '__main__':
    run()