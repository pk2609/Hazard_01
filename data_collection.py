'''
In this module we created a ML model which classifies and predicts Fake news 
 and determines authenticity
'''
import pandas as pd
import sklearn.model_selection as skl
import sklearn.feature_extraction.text as txtx
from sklearn.naive_bayes import MultinomialNB
import sklearn.metrics as met
df = pd.read_csv("https://s3.amazonaws.com/assets.datacamp.com/blog_assets/fake_or_real_news.csv")
df = df.set_index("Unnamed: 0")
y = df.label 
df.drop("label", axis=1)
X_train, X_test, y_train, y_test = skl.train_test_split(df['text'], y, test_size=0.1, random_state=53)
count_vectorizer = txtx.CountVectorizer(stop_words='english')
count_train = count_vectorizer.fit_transform(X_train)
count_test = count_vectorizer.transform(X_test)
print(count_vectorizer.get_feature_names()[:10])
count_df = pd.DataFrame(count_train.A, columns=count_vectorizer.get_feature_names())
count_df.head()
clf=MultinomialNB()
clf.fit(count_train,y_train)
pred=clf.predict(count_test)
print(pred)
score=met.accuracy_score(y_test,pred)
print(score)#91%