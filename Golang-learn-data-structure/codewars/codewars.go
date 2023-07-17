package codewars

import (
	"regexp"
	"strings"
)

// sentence Smash
func SentenceSmash(words ...string) string {
	regexPattern := regexp.MustCompile("[^a-zA-Z0-9 ]")
	return regexPattern.ReplaceAllString(strings.Join(words, " "), "")
}
