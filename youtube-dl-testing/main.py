from __future__ import unicode_literals
import youtube_dl


class MyLogger(object):
    def debug(self, msg):
        print("MDEBUG: "+msg)

    def warning(self, msg):
        print("MWARNING: " + msg)

    def error(self, msg):
        print("MERROR: " + msg)


ydl_opts = {
    'format': 'bestaudio/best',  # choice of quality
    'extractaudio': True,  # only keep the audio
    'audioformat': 'mp3',  # convert to mp3
    'outtmpl': '%(author)s/%(title)s.%(ext)s',  # name the location
    'postprocessors': [{
        'key': 'FFmpegExtractAudio',
        'preferredcodec': 'mp3',
        'preferredquality': '320',
    }],
    'logger': MyLogger()
}
with youtube_dl.YoutubeDL(ydl_opts) as ydl:
    try:
        ydl.download(['https://www.youtube.com/watch?v=5ZlD8s4EUy0'])
    except Exception as e:
        print(e)

